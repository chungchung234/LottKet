package lotte.com.lottket.dto;

public class UserDto {
    private int userId;
    private String userNickname;
    private String userProfileImage;
    private String userAddress;
    private String userDetailAddress;
    private String userGrade;
    private String userRole;
    private String userGender;
    private String userAge;
    private String userBirthday;

    public UserDto(int userId) {
        this.userId = userId;
    }

    public UserDto(String userNickname, String userProfileImage, String userAddress, String userDetailAddress, String userGrade, String userRole, String userGender, String userAge, String userBirthday) {
        this.userNickname = userNickname;
        this.userProfileImage = userProfileImage;
        this.userAddress = userAddress;
        this.userDetailAddress = userDetailAddress;
        this.userGrade = userGrade;
        this.userRole = userRole;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
    }

    public UserDto(int userId, String userNickname, String userProfileImage, String userAddress, String userDetailAddress, String userGrade, String userRole, String userGender, String userAge, String userBirthday) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userProfileImage = userProfileImage;
        this.userAddress = userAddress;
        this.userDetailAddress = userDetailAddress;
        this.userGrade = userGrade;
        this.userRole = userRole;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserDetailAddress() {
        return userDetailAddress;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public String getUserBirthday() {
        return userBirthday;
    }
}