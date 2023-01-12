public class DynamicArray {
    // (ES) Código para crear arrays de enteros dinamicos sin tener que especificar el tamaño del array
    // (EN) Code to create integer dynamic arrays without having to specify the size of the array
    private int[] array;
    private int count = 0, size = 1;
    public DynamicArray(){
        this.array = new int[size];
    }

    public void add(int data){
        array[count++] = data;
        updateSizeArray();
    }
    private void updateSizeArray(){
        int[] temp = new int[++size];
        int zero = 0;
        System.arraycopy(array, zero, temp, zero, array.length);
        array = temp;
    }

    public int[] getArray(){
        return array;
    }
}
