public class Main {
    public void Iterate(){
        try{
            int[] nums = {1,2,3,4};
            for(int i=0;i<=nums.length;i++){
                System.out.println(nums[i]);
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Wrong Index");
        }catch(ArithmeticException s){
            System.out.println("Artmatic Error");
        }
        finally{
            System.out.println("Done!");
        }
        System.out.println("Cotinue");
    }
    public static void main(String[] args) {

    }
}