public class User {
    private String name;
    private String food_date;
    private String time;
    private String address;
    private String number;
    private String judge;
    private boolean user_judge = false;

    public User() {
    }

    public User(String name, String food_date, String time, String address, String number, String judge, boolean user_judge) {
        this.name = name;
        this.food_date = food_date;
        this.time = time;
        this.address = address;
        this.number = number;
        this.judge = judge;
        this.user_judge = user_judge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood_date() {
        return food_date;
    }

    public void setFood_date(String food_date) {
        this.food_date = food_date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public boolean isUser_judge() {
        return user_judge;
    }

    public void setUser_judge(boolean user_judge) {
        this.user_judge = user_judge;
    }
}




