public class FilaCircular {
    private int top;
    private int base;
    private int cap;
    private int[] itens;
    private int sizeAtual;

    public FilaCircular(int size) {
        this.top = -1;
        this.base = 0;
        this.cap = size;
        this.itens = new int[size];
        this.sizeAtual = 0;
    }

    public void add(int item) {
        if(isFull()) {
            System.out.println("fila cheia🤣");
        } else {
            top = (top + 1) % cap;
            itens[top] = item;
            sizeAtual++;
        }
    }
    
    public int remove(){
        int valor = itens[base];
        System.out.println("item removido 😂😂");
        base = (base + 1) % cap;
        sizeAtual--;
        return valor;        
    }

    public void clear(){
        top = -1;
        base = 0;
        sizeAtual = 0;        
    }

    public boolean isFull(){
        return sizeAtual == cap;
    }

    public boolean isEmpty(){
        return sizeAtual == 0;
    }

    public void move(int position, int size){
        if(position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("posicao da fila tá meio errada🤔");
        } else {
            int troca = itens[top];
            itens[top] = itens[base];
            itens[base] = troca;            
        }
    }

    public void print(){
        for(int i = 0; i < sizeAtual; i++){
            System.out.println(itens[i]);
        }
    }
    
}