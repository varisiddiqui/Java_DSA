 Set<Integer> freq = hm.keySet();
        for(Integer key : freq){
            if(hm.get(key) > (a.length/3))
            System.out.println(key+" ");
            
        }