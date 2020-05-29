/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wangemoney;
import java.util.Scanner;
/**
 *
 * @author Alex Conro Manuel
 */
public class Login {
     public static void main(String[] args) 
    {

      Scanner input = new Scanner (System.in);  

      String username;
      String password;


      System.out.println("Selamat datang di wangemoney!");
      System.out.println("\nsilahkan isi username dan pasword untuk masuk ke akun anda.");    

      System.out.println("Username: ");
        username = input.nextLine();

      System.out.println("Password: ");
        password = input.nextLine();

        UserAccount login = new UserAccount(username, password);

        if(login.checkPassword())
            System.out.println("Username atau password salah.");
        else
            System.out.println("Login sukses.");
    }

}
