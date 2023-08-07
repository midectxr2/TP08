public class MultiplicativeArrayList extends MyArrayList{
    public MultiplicativeArrayList(int taille, int modificateur){
        super(taille, modificateur);
        tab = new Object[taille];
        size = 0;
        copies = 0;
    }

    protected Object[] tab;
    protected int size;
    protected int copies;
    public void add(Object o){
        int oldSize = size();
        size++;
        Object[] newTab = new Object[oldSize * modificateur];
        if(oldSize > 0){
            System.arraycopy(tab, 0, newTab,0, oldSize);
            copies++;
        }
        newTab[oldSize] = o;
        tab = newTab;
    }

    public void add(int i, Object o){
        int oldSize = size();
        size++;
        Object[] newTab = new Object[oldSize * modificateur];
        if(oldSize > 0){
            System.arraycopy(tab, 0, newTab,0, i);
            copies++;
        }
        for(int y = i; y<newTab.length; i++){
            newTab[y+1] = tab[y];
        }
        copies++;
        tab = newTab;
    }
}
