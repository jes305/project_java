class LoginSystem {

    public void validatePassword(String password) throws Exception {
        if (password.length() < 6) {
            throw new Exception("Password must be at least 6 characters long.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Password must contain at least one uppercase letter.");
        }

        if (!password.matches(".*[0-9].*")) {
            throw new Exception("Password must contain at least one number.");
        }
    }

    public void login(User user, String password) {
        try {
            if (user.checkPassword(password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Incorrect Password!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
