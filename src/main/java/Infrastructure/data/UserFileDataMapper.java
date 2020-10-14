package Infrastructure.data;

import java.io.*;

public class UserFileDataMapper implements UserDataMapper {
    User[] users = new User[9];

    public UserFileDataMapper() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("users.txt")))) {
            String rb = null;
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");

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
    public User findUserByEmail(String email)  {
       try {
           for ( User user : users) {
               if (user.getUserEmail().equals(email)) {
                   return user;
               }
           }
           throw new UserNotFoundException("User not found");
       } catch (UserNotFoundException e){
           System.out.print(e.getMessage() + " by email. Method returned  ");
       }
       return null;
    }


    @Override
    public User findUserByName(String name){
     try {
            for (User user : users) {

                if (user.getUserName().equals(name)) {
                    return user;
                }
            }
          throw new UserNotFoundException("User not found");
        } catch (UserNotFoundException e) {
            System.out.print(e.getMessage() +" by name. Method returned  ");

        }
        return null;
    }

    public User[] getAll() {
        return users;
    }
}
