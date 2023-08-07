

public abstract class MyArrayList {
    int taille;
    int modificateur;
    public MyArrayList(int taille, int modificateur){
        this.taille = taille;
        this.modificateur = modificateur;
        tab = new Object[taille];
        size = 0;
        copies = 0;

    }
    protected Object[] tab;
    protected int size;
    protected int copies;

    public abstract void add(Object o);

    public abstract void add(int i, Object o);

    public Object get(int i){
        if(tab[i] == null)
            throw new IndexOutOfBoundsException();
        return tab[i];
    }

    public  int size(){
        return size;
    }

    public int physicalSize(){
        return tab.length;
    }

}
