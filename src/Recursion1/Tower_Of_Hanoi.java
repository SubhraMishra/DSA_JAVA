package Recursion1;

public class Tower_Of_Hanoi {
    public static void main(String args[]){
        TowerOfHanoi(3,'a','b','c');

    }
    public static void TowerOfHanoi(int disks,char source,char auxillary,char destination){
        if(disks==0)
            return;
        else if(disks==1){
            System.out.println(source+" "+destination);
            return;
        }
        TowerOfHanoi(disks-1,source,destination,auxillary);
        System.out.println(source+" "+destination);
        TowerOfHanoi(disks-1,auxillary,source,destination);
    }
}
