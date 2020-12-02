package Infrastructure.data;

import java.util.Objects;

public class User {
    public String id;
    public String userName;
    public String userEmail;
    public String userPassword;
    public String expectedCondition;

    public User(String id, String userName, String userEmail, String userPassword, String expectedCondition) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.expectedCondition = expectedCondition;
    }

    @Override
    public String toString() {
        return userEmail + ";" + userPassword + "##";
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getExpectedCondition() {
        if (expectedCondition.contains("\\n")) {
            String expectedConditionsWithSeveralLines = "";
            String[] splitedExpectedCondition = expectedCondition.split("\\\\n");
            for (int i = 0; i < splitedExpectedCondition.length; i++) {
                expectedConditionsWithSeveralLines = expectedConditionsWithSeveralLines + "\n" + splitedExpectedCondition[i];
            }
            return expectedConditionsWithSeveralLines.substring(1);
        }
        return expectedCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userEmail, user.userEmail) &&
                Objects.equals(userPassword, user.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userEmail, userPassword);
    }
}
