class User {
    private String username;
    private String password;
    private int loginAttempts = 0;
    private boolean isLocked = false;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        if (isLocked) {
            throw new RuntimeException("Account is locked due to multiple failed attempts.");
        }

        if (password.equals(inputPassword)) {
            loginAttempts = 0;
            return true;
        } else {
            loginAttempts++;
            if (loginAttempts >= 3) {
                isLocked = true;
            }
            return false;
        }
    }
}