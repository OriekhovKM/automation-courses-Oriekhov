package Infrastructure.data;

import java.io.*;

public class FileDataMapper implements DataMapper {
    User[] users = new User[10];

    public FileDataMapper() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("users.txt")));
            String rb = null;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");
                try {
                    String s = rb.split(";")[3];
                } catch (ArrayIndexOutOfBoundsException ex) {
                    continue;
                }

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User(splitedUser[0], splitedUser[1], splitedUser[2], splitedUser[3]);
                        break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User findUserByEmail(String email) {
        for (User user:users) {
            if (user.getUserEmail().equals(email)) {
                return user;
            }

        }
        return null;
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    public User[] getAll() {
        return users;
    }
}
