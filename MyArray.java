class MyArray<E>{

private int init = 10;
private Object[] array = new Object [init];
private int index;

public int size(){
    return index;
}

public void add(Object value) {
    if(index == array.length){
        resize(array.length * 2);
    }

    array[index] = value;
    index++;
}

public void add(int ind, Object value){
     if(index == array.length){
        resize(array.length * 2);
    }

    array[ind] = value;
    index++;

}

public Object get(int ind){
    if (ind < array.length)
        return array[ind];
    else
        return "No such index";
}

public void remove(int ind) {
    for (int i = ind; i<index; i++)
        array[i] = array[i+1];

    array[index] = null;
    index--;

    if (array.length > init && index < array.length/2)
        resize (array.length/2);
}

private void resize(int newLength) {
    Object[] newArray = new Object[newLength];
    System.arraycopy(array, 0, newArray, 0, index);
    array = newArray;
}

public String toString() {
    String value = "";

    for (int i = 0; i < array.length; i++){
       // if (array[i] != null)
            value = value + " " + array[i];
    }
    return value;
}
}