#include <iostream>
#include<string>
#include<stack>

using namespace std;


int main()
{
    string s;
    stack <char> st;
    
    s = "abc";
    s += "a";
    s += "+";
    st.push(s[4]);
     cout<<st.top();
     
    if(s[4] == '+')
       cout<<"Yes"<<endl;
     cout<<s<<endl;
    
    return 0;
}

