package threads;

class demo
{
    public static void main(String[] args)
    {
        int value = 3, sum = 6 + -- value;
        // value = 2, sum = 8
        int data = --value + ((++value / sum++) * value++) + (++sum % value--);
        //              2           3       9       1            9      2
        System.out.println(data+ " " + sum+ " "+ value); // 2 10 2
    }
}

