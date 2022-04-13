

public class Task {

    public boolean checkIfIsValid(String password) {

        boolean tempBool = false;

        if (password.length() < 20) {
            return false;
        }

        for (char charr: password.toCharArray()) {
            if(Character.isUpperCase(charr)) {
                tempBool = true;
                break;
            }
        }


        if(!tempBool) {
            return false;
        }

        tempBool = false;

        for (char charr: password.toCharArray()) {
            if(Character.isLowerCase(charr)) {
                tempBool = true;
                break;
            }
        }

        if(!tempBool) {
            return false;
        }


        // for each char in String
        // check if it is an uppercase
        // if it is no upper cases return false

        // for each char in String
        // check if it is an lower
        // if it is no upper cases return false

        // for each char in String
        // check if it is an special
        // if it is no upper cases return false

        // for each char in String
        // check if it is has a number
        // if it is no upper cases return false

        return false;
    }

    public static void main(String[] args) {

        Task task = new Task();

        task.checkIfIsValid("xasxasxasx");

/*
        for (char charr: password.toCharArray() ) {
            if (Character.isUpperCase(charr)) {
                tempBool = true;
                break;
            }
        }

        if(!tempBool) {
            return false;
        }
    }

 */
    }
}
