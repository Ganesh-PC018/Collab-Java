package google;
public class PracticalNumber04 {
    public static boolean enrollVarifier(Character arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i<4 || (i >= arr.length-3 && i < arr.length))
            {
               boolean b = Character.isDigit(arr[i]);
               if(!b)
               {
                return false;
               }
            }
            if(i >= 4 && i< arr.length-3)
            {
                boolean c = Character.isAlphabetic(arr[i]);
                if(!c)
                {
                    return false;
                }
            }
          
        }
        return true;
    }
    public static void main(String[] args) {
        // String s = "2023BIT501";
        Character arr[] ={'2','0','2','3','B','I','T','5','0','1'};
        
        if(enrollVarifier(arr))
        {
            System.out.println("The Given Number is varified Number.");
        }
        else
        {
            System.out.println("The Given Number is NOT varified Number.");
        }

    }
}
