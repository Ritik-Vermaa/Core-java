// import java.util.Scanner;

// public class UpdateBit {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int oper = sc.nextInt();// update bit to 1 else update bit 0

//         // oper = 1 : set oper = 0 : clear
//         int n = 5;// 0101
//         int pos = 1;
    
         
//         int bitmask = 1<<pos;
//         if (oper == 1) {
//             //set 
//             int newNumber = bitmask | n;
//             System.out.println(newNumber);
//         }
//         else{
//             //clear
//             int newBitMask = ~ (bitmask);
//             int newNumber = newBitMask & n;
//             System.out.println(newNumber);

//         }
//     }
// }
