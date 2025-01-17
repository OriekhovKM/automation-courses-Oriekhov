package Infrastructure.data;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class UserFileDataMapper implements UserDataMapper {
    List<User> users = new ArrayList();
    private final static String USER_FILE_PATCH = "users.txt";

    public UserFileDataMapper(){
        this(USER_FILE_PATCH);
    }
  
    public UserFileDataMapper(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            String rb = null;

            int i = 0;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");
                users.add(i, new User(splitedUser[0], splitedUser[1], splitedUser[2], splitedUser[3]));
                i++;

            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("unable to read data from file");
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to work with I/O streams");
        }
    }

    @Override
    public User findUserByEmail(String email) throws UserNotFoundException {

        for (int i = 0; i < users.size(); i++) {
            users.get(i);
            if (users.get(i) != null && users.get(i).getUserEmail().equals(email)) {
                return users.get(i);
            }
        }
        throw new UserNotFoundException(String.format("User with email '%s' not found ", email));

    }


    @Override
    public User findUserByName(String name) throws UserNotFoundException {

        for (int i = 0; i < users.size(); i++) {
            users.get(i);
            if (users.get(i) != null && users.get(i).getUserName().equals(name)) {
                return users.get(i);
            }
        }
        throw new UserNotFoundException(String.format("User with name '%s' not found", name));
    }

    public ArrayList getAll() {
        return (ArrayList) users;
    }
}