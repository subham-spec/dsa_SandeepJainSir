class DeletionInHeap{
	static int arr[];
	static int size;
	static int cap;
	DeletionInHeap(int cap){
		this.cap = cap;
		arr = new int[cap];
		size = 0;
	}
	void insert(int x){
        arr[size++] = x;
        int i = size-1;
        while(i >= 1){
            int p = (i-1)/2;
            if(arr[p] < arr[i]){
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                i = p;
            }
            else
                return;
        }
    }
    void print(){
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");
    }
    void delete(){
        if(size == 0)
            return;
        arr[0] = arr[size-1];
        size--;

        // take root node to its right position.
        int i=0;
        while(i<size){
            int l = 2*i+1;
            int r = 2*i+2;

            if(l<size && arr[i]<arr[l]){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
            }
            else if(r<size && arr[i]<arr[r]){
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
            }
            else return;
        }
    }
	public static void main(String[] args){
		DeletionInHeap h = new DeletionInHeap(7);
		h.insert(18);
        h.insert(14);
        h.insert(16);
        h.insert(6);
        h.insert(4);
        h.insert(15);
        h.insert(11);
         
        h.delete();
        
        h.print();
	}
}