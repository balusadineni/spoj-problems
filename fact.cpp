#include<iostream>
using namespace std;

int main()
{
    int T;cin>>T;
    int N;
    long long F=1;
    for(int i=0;i<T;i++)
    {
        cin>>N;
        for(int j=1;j<=N;j++)
        {
            F *= j;
        }
        cout<<F<<'\n';
        F = 1;
    }
  return 0;
}
