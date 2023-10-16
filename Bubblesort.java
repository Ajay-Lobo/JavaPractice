class BubbleSort {
  public static void main(String[] args) {
int arr[]= {1,6,8,4,2,1};
    int temp=0;
    int n=arr.length;
    for(int i=0;i<n;i++)
    {     
      for(int j=1;j<n-1;j++)
      {      
        if(arr[j]>arr[j+1])
        {
          temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i : arr){
      System.out.println(i);
    
    }
    for(int i = 0;i <n;i++){
      System.out.print(arr[i]+ " ");
    }
  }

}