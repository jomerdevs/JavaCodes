public class TowerOfHanoiAlgorithm {
    // [ES] Código para resolver el algoritmo matemático de la torre de hanoi
    // [EN] Code to solve the mathematical algorithm of the tower of hanoi

    // Función recursiva para resolver el algoritmo de la torre de hanoi
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Mover dico 1 desde la varilla " +  from_rod + " hacia la varilla " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Mover disco " + n + " desde la varilla " +  from_rod + " hacia la varilla " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

    //  Método main
    public static void main(String args[])
    {
        int n = 4; // Número de discos
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B y C son los nombres de las varillas
    }
}
