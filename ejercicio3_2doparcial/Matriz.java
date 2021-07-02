
public class Matriz
{
    private int matriz[][];
    private int espacio;
    public Matriz(int espacio)
    {
        this.espacio = espacio;
        matriz = new int[espacio][espacio]; 
    }

    public void recorridoDelCaracol()
    {
        int primerNumero = 1;
        int limiteEspacio = espacio - 1;
        for (int valor = 1; valor <= limiteEspacio / 2; valor++)
        
        {
            
            for (int i = valor; i <= limiteEspacio - valor; i++)
            {
                matriz[valor][i] = primerNumero;
                primerNumero++;
            }
            for (int i = valor; i <= limiteEspacio - valor; i++) 
            {
                matriz[i][limiteEspacio - valor + 1] = primerNumero;
                primerNumero++;
            }
            for (int i = limiteEspacio - valor + 1; i >= valor + 1; i--)
            {
                matriz[limiteEspacio - valor + 1][i] = primerNumero;
                primerNumero++;
            }
            for (int i = limiteEspacio - valor + 1; i >= valor + 1; i--)
            {
                matriz[i][valor] = primerNumero;
                primerNumero++;
            }
        }
        if (limiteEspacio % 2 == 1) 
        {
            matriz[limiteEspacio / 2 + 1][limiteEspacio / 2 + 1] = primerNumero;
        }

    }

    public void recorridoDiagonal()
    {
        int lim = espacio-1;
        for(int x = 0;x < espacio;x++)
        {
            for(int y = 0;y < espacio;y++)
            {
                if(x == y)
                {
                    matriz[x][y] = 1;
                }else
                {
                    matriz[x][y] = 0;
                }
            }
            matriz[x][lim] = 1;
            lim --;
        }
    }

    public void recorridoNormal()
    {
        int contador = 0;
        for(int x = 0;x < espacio;x++)
        {
            for(int y = 0;y < espacio;y++)
            {
                contador++;
                matriz [x] [y] = contador;
            }
        }
    }

    public void imprimirMatriz()
    {
        for(int x = 0;x < espacio;x++)
        {
            for(int y = 0;y < espacio;y++)
            {
                System.out.print(matriz [x] [y]+" ");
            }
            System.out.println("");
        }
    }
}