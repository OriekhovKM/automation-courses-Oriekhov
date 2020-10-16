package Infrastructure.data;

import java.io.*;
import java.util.ArrayList;

public class UserFileDataMapper implements UserDataMapper {
    ArrayList users = new ArrayList(10);
   // ArrayList splitedUser = new ArrayList();

    public UserFileDataMapper() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("users.txt")))) {
            String rb = null;
            int i = 0;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");
                users.add(i, new User(splitedUser[0], splitedUser[1], splitedUser[2], splitedUser[3]));
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUserByEmail(String email) throws UserNotFoundException {
        User user;
        for (int i = 0; i < users.size(); i++) {
           user = (User) users.get(i);
            if (user != null && user.getUserEmail().equals(email)) {
                   return user;
             }
        }
           throw new UserNotFoundException(String.format("User with email '%s' not found ", email));
    }


    @Override
    public User findUserByName(String name) throws UserNotFoundException {
        User user;
        for (int i = 0; i < users.size(); i++) {
            user = (User) users.get(i);
            if (user != null && user.getUserName().equals(name)) {
                return user;
            }
        }
        throw new UserNotFoundException(String.format("User with name '%s' not found", name));
    }



        public ArrayList getAll () {
            return users;
        }

    }