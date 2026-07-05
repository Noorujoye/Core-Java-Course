package Arrays;
public class search_li {
    static public void search_li(int arr[] , int value){
        for (int i = 0; i <= arr.length; i++){
            if (value == arr[i]) {
                System.out.println("value found at index " + arr[i]);
            }
            else{
                System.out.println("value is not in the list");
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2 ,3, 4 ,5,6,7,8,9,10};
        int value = 10;
        search_li(arr , value);
    }
}