import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String judge;
        do {
            user();
            order();
            System.out.println("Thank you!");
            System.out.print("Do you want to enter another order for home delivery? (y/n):  ");
            judge = scan.nextLine();
        } while (Objects.equals(judge, "Y") || Objects.equals(judge, "y"));
    }


//*****************************
//Create the user
//*****************************
    public static void user(){
        Scanner scan = new Scanner(System.in);
        User user = new User();

        System.out.println("Welcome to Workout Foods !!!");

        System.out.print("1.Please enter your name: ");
        String name = scan.nextLine();
        user.setName(name);

        System.out.print("2.What is the date the food is required:(day/month/year): ");
        String food_date = scan.nextLine();
        user.setFood_date(food_date);

        System.out.print("3.What is the time for the home delivery:(10:00am): ");
        String time = scan.nextLine();
        user.setTime(time);

        System.out.print("4.What is the address to deliver to: ");
        String address = scan.nextLine();
        user.setAddress(address);

        System.out.print("5.What is a phone number for the customer:  ");
        String number = scan.nextLine();
        user.setNumber(number);

//**********************************************
//        if user message wrong ,he can update
//**********************************************
        update_user(user);

    }

//*****************************
//Update the user information
//*****************************
    public static void update_user(User user){
        System.out.print("Please check whether the above information is correctly entered(Y/N):  ");
        Scanner scan = new Scanner(System.in);
        String judge = scan.nextLine();
        if (Objects.equals(judge, "N") || Objects.equals(judge, "n"))
            user.setUser_judge(true);
        else {
            show_user(user);

        }
        while (user.isUser_judge()) {
            System.out.println("\n******** Customer Information ***********");
            System.out.println("1. Please enter your name:\t" + user.getName());
            System.out.println("2. What is the date the food is required:(day/month/year):\t" + user.getFood_date());
            System.out.println("3. What is the time for the home delivery:(10:00am):\t" + user.getTime());
            System.out.println("4. What is the address to deliver to:\t" + user.getAddress());
            System.out.println("5. What is a phone number for the customer:\t" + user.getNumber());
            System.out.println("6. Exit");
            System.out.print("Please enter the options you want to modify: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please enter your name: ");
                    String newName = scan.nextLine();
                    user.setName(newName);
                    break;
                case 2:
                    System.out.println("What is the date the food is required:(day/month/year): ");
                    String newFood_date = scan.nextLine();
                    user.setFood_date(newFood_date);
                    break;
                case 3:
                    System.out.println("What is the time for the home delivery:(10:00am): ");
                    String newTime = scan.nextLine();
                    user.setTime(newTime);
                    break;
                case 4:
                    System.out.println("What is the address to deliver to: ");
                    String newAddress = scan.nextLine();
                    user.setAddress(newAddress);
                    break;
                case 5:
                    System.out.println("What is a phone number for the customer: ");
                    String newNumber = scan.nextLine();
                    user.setNumber(newNumber);
                    break;
                case 6:
                    System.out.println("Information has been modified!!! ");
                    show_user(user);
                    user.setUser_judge(false);
                    break;
                default:
                    System.out.println("Wrong!!! Check your entry");
            }
        }
    }

//*****************************
//Show the details about user
//*****************************
    public static void show_user(User user){
        System.out.println("\n************ Customer Information ****************");
        System.out.println("1. Please enter your name:\t" + user.getName());
        System.out.println("2. What is the date the food is required:(day/month/year):\t" + user.getFood_date());
        System.out.println("3. What is the time for the home delivery:(10:00am):\t" + user.getTime());
        System.out.println("4. What is the address to deliver to:\t" + user.getAddress());
        System.out.println("5. What is a phone number for the customer:\t" + user.getNumber());
        System.out.println("Thank you!");
        System.out.println("***************************************************"+'\n');
    }


//*****************************
//Create the order
//*****************************
    public static void order(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Order> list = new ArrayList<>();

        while (true) {
            System.out.println("****************************************************");
            System.out.println("The following are options you can add to your catering booking order: ");
            System.out.println("1. Chicken & Chorizo Paella 360g (9.95$ per serving)");
            System.out.println("2. Low carb Moussaka (10.50$ per serving)");
            System.out.println("3. Vitality Veggie (13.95$ per pack)");
            System.out.println("4. Angus Beef & Veg Lasagne (15.50$ per pack)");
            System.out.println("5. Chicken Cacciatore & Roast Pumpkin (11.95$ per meal)");
            System.out.println("6. Healthy Meal Kit for 2 people (23.49$ per box)");
            System.out.println("7. Value 10 Complete Meal Box (123$ per box)");
            System.out.println("****************************************************");

            ArrayList<String> dish_name = new ArrayList<>();
            dish_name.add("Chicken & Chorizo Paella 360g");
            dish_name.add("Low carb Moussaka");
            dish_name.add("Vitality Veggie");
            dish_name.add("Angus Beef & Veg Lasagne");
            dish_name.add("Chicken Cacciatore & Roast Pumpkin");
            dish_name.add("Healthy Meal Kit for 2 people");
            dish_name.add("Value 10 Complete Meal Box");
            ArrayList<Double> dish_price = new ArrayList<>();
            dish_price.add(9.95);
            dish_price.add(10.50);
            dish_price.add(13.95);
            dish_price.add(15.50);
            dish_price.add(11.95);
            dish_price.add(23.49);
            dish_price.add(123.00);

            int j = re_dish(dish_name);

            if (j >= 0) {
                System.out.print("How many " + dish_name.get(j) + "(" + dish_price.get(j) + "$ per serving) would you like: ");
                int dish_count = scan.nextInt();
                scan.nextLine();
                show_order(dish_name,dish_count,dish_price,list,j);
            }else {
                System.out.println("Wrong!!! Check your entry");
            }

            System.out.print("Do you want to add other dishes? (y/n):  ");
            String judge = scan.nextLine();
            if (Objects.equals(judge, "N") || Objects.equals(judge, "n"))
                break;
        }

    }

//*****************************
//Determine whether the user has entered the dish name correctly
//*****************************
    public static int re_dish(ArrayList<String> dish_name){
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("What would you like to add to the booking order: ");
        String dish_name1 = scan.nextLine();
        for (i = 0; i < dish_name.size(); i++) {
            if (Objects.equals(dish_name1, dish_name.get(i))) {
                return i;
            }
        }
        return -1;
    }

//*****************************
//Show the details about order
//*****************************
    public static void show_order(ArrayList<String> dish_name,int dish_count,ArrayList<Double> dish_price,ArrayList<Order> list,int j){
        Order order = new Order();
        double total = 0;
        DecimalFormat change = new DecimalFormat("#.00");
        System.out.println("Ordered items:  ");
        order.setDish_count(dish_count);
        order.setDish_name(dish_name.get(j));
        order.setDish_price(dish_price.get(j));
        list.add(order);
        for (int i = 0; i < list.size(); i++) {
            Order order1 = list.get(i);
            System.out.println(order1.getDish_count() +" x "+order1.getDish_name()+"-----------------------"+change.format(order1.getDish_count()*order1.getDish_price()));
            total += order1.getDish_count()*order1.getDish_price();
        }

        System.out.print("The total cost of this order is: ");
        if (total >= 100) {
            System.out.println("$"+change.format(total));
        } else{
            System.out.println("$"+change.format(total+5));
        }
    }
}




