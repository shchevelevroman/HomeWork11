import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //Task#1-3
        System.out.println("Task#1");
        String firstName = "Иванов";
        String middleName = "Семёнович";
        String lastName = "Семён";
        String fullName = firstName + " " + lastName + " " + middleName;
        String fullName1 = fullName.toUpperCase();
        fullName1 = fullName.replace("ё","е");
        System.out.println("ФИО сотрудника "+ fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);
    }
}