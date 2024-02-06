    import java.util.ArrayList;
    import java.util.Arrays;

    class create_3column_list {
        int count_element=0;
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        create_3column_list(int m, int n){ // cnstructor
            a.add(new ArrayList<Integer>(Arrays.asList(m,n)));
        }
        create_3column_list(){} // cnstructor

        void set(int i, int j, int x){
            if(x!=0){
                a.add(new ArrayList<Integer>(Arrays.asList(i,j,x)));
                count_element++;
            }
        }

        void set_total_elements(){
            a.get(0).add(count_element);
        }


    }