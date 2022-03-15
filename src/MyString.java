class MyString {

    private char[] arr;

    MyString() {

    }

    MyString(char[] arr) {
        this.arr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    MyString(MyString str) {
        this.arr = new char[str.arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = str.arr[i];
        }
    }


    void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    char charAt(int index) {
        for (int i = 0; i < arr.length; i++) {
             i = index;
            return arr[i];
        }
        return '0';
    }


    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};

        MyString myString = new MyString(arr1);
        MyString myString1 = new MyString(myString);
        myString.show();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) i;
        }
        myString.show();
        myString1.show();
        System.out.println(myString.charAt(0));


    }
}

