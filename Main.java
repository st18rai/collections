class Main {
    public static void main(String args[]){

        MyArray array = new MyArray();

        for (int i = 0; i < 16; i++){
            array.add(i);
        }

        System.out.println("Value: " + array.toString());

        array.remove(0);
        System.out.println("Value: " + array.toString());

        System.out.println("Array size: " + array.size());

        array.add(17, 18);
        System.out.println("Value: " + array.toString());

        System.out.println("Value at index: " + array.get(10));


    }
}