var evaluateExpression=function(expr)
{
    var operate=function(first,second,operator)
    {
        switch(operator)
        {
            case '+': return first+second;
            case '-': return first-second;
            case '*': return first*second;
            case '/': return first/second;
        }
    }
    console.log('called')
    var symbolsStack=[]
    var symbolsPriority={'-':0,'+':1,'*':2,'/':3,'*':4,')':5,'(':6}
    var dataStack=[]

    var result=0
    for(let i=0;i<expr.length;++i)
    {
        let t=""
        if(!isNaN(expr[i]))// if digit
            t+=expr[i]
    }

    for(let i=0;i<expr.length;++i)
    {
        if(expr[i]==')')// symbol
        {
            let currentSymbol
            while(  (currentSymbol=symbolsStack.pop())  !='(')
            {
                let secondValue=dataStack.pop()
                let firstValue=dataStack.pop()
                dataStack.push(operate(firstValue,secondValue,currentSymbol))
            }
        }
        else if(expr[i]=='(')
        {
            symbolsStack.push('(')
            continue
        }
        else if(isNaN(expr[i]))// any operator
        {
            while(symbolsPriority[expr[i]]<symbolsStack[symbolsStack.length-1])// when the current operator has less priority do all the operations for higher priority operators
            {
                let secondValue=dataStack.pop()
                let firstValue=dataStack.pop()
                let operator=symbolsStack.pop()
                dataStack.push(operate(firstValue,secondValue,operator))
            }
            symbolsStack.push(expr[i])
        }
        else if(!isNaN(expr[i]))// if any digit
        {
            let start=i
            let end=start
            while(!isNaN(expr[end]))// to form number when digits are continuous
            {
                ++end
            }
            let num=Number(expr.substring(start,end))
            dataStack.push(num)
            i=end-1
        }
        else continue;
    }
    while(symbolsStack.length>0)
    {
        let secondValue=dataStack.pop()
        let firstValue=dataStack.pop()
        let operator=symbolsStack.pop()
        dataStack.push(operate(firstValue,secondValue,operator))
    }
    return dataStack.pop()
}

var isPalindrome=function(str)
{
    var stack=[]
    var reverseString=''
    for(char of str)
    {
        stack.push(char)
    }
    while(stack.length!=0)
    {
        reverseString+=stack.pop()
    }
    return str==reverseString?true:false
}

var isNarcissisticNumber=function(n)
{
    var t_n=n
    var size=0
    var dup=0
    while(t_n!=0)
    {
        ++size
        t_n=parseInt(t_n/10)
    }
    t_n=n
    while(t_n!=0)
    {
        dup+=Math.pow((t_n%10),size)
        t_n=parseInt(t_n/10)
    }
    if(dup==n)return true
    else return false
}

function vowelsAndConsonants(s) {
    var vowels = []
    var consonents = []
    for (var char of s)
    {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
        {
            vowels.push(char)
        }
        else consonents.push(char)
    }
    for (char of vowels)
    {
        console.log(char)
    }
    for (char of consonents) {
        console.log(char)
    }
}
function regexVar(str) {

    var re =/a[a-z]*a|e[a-z]*e|i[a-z]*i|o[a-z]*o|u[a-z]*u/
    return re.test(str)
}


var positions=[false,false,false,false,false,false,false,false,false]
var sequence=''
var map={}
var tictaktoeClick=function(position)
{
    sequence+=position
    positions[position]=true
    requiredStep=tictactoe(sequence)
    sequence+=requiredStep
    console.log(requiredStep)
}

var tictactoe=function(steps)
{
    

}











exports.evaluateExpression=evaluateExpression