#include <iostream>
using namespace std;


void MaxHeapify(int * a,int i,int n)
{
    int j,temp;
    temp = a[i];
    j = 2*i;
    while(j<=n)
    {
        if(j<n && a[j+1]>a[j])
        {
            j = j+1;
        }
        if(temp > a[j])
          break;
        else if(temp <= a[j])
        {  
            a[j/2] = a[j];
            j = 2*j;
        }
    }
    
    a[j/2] = temp;
    return;
}



void Heapsort(int * a,int n)
{ 
    int i,temp;
    for(i = n;i>=2;i--)
    {
      temp = a[i];
      a[i] = a[1];
      a[1] = temp;
      MaxHeapify(a,1,i-1);
    }
}



void Build_maxheap(int * a,int n)
{  
    for(int i=n/2; i>= 1; i--)
       {
           MaxHeapify(a,i,n);
       }

}


int main()
{
    int n;
    cout<<"Enter the number of elements : ";
    cin>>n;
    int arr[20];
    
    cout<<"Enter the elements of the array "<<endl;
    for(int i=0;i<n;i++)
       {
           cin>>arr[i];
       }
    Build_maxheap(arr,n);
    Heapsort(arr,n);
    cout<<"Sorted Array "<<endl;
    for(int j=1;j<=n;j++)
       {
          cout<<arr[j]<<endl;
       }

 return 0;
}
