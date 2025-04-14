class StrUse {
    public static void main(String[] args) {
        String name = "VarisSiddiqui";
        int l = name.length();
        // System.out.println(name);
        // System.out.println("length is:"+l);

        String str1 = name.toLowerCase();
        // System.out.println(str1);

        String str2 = name.toUpperCase();
        // System.out.println(str2);

        String s = "   The";
        String str3 = s.trim();
        // System.out.println(str3);
        // System.out.println(name.substring(2));
        // System.out.println(name.substring(2,5));
        // end wala leave karega

        String a1 = name.replace('a', 'n');
        // System.out.println(a1);
        String a2 = name.replace("Var", "mohammad");
        // System.out.println(a2);
        // System.out.println(name.startsWith("Var"));
        // System.out.println(name.endsWith("Var"));
        char ch = name.charAt(2);
        // System.out.println(ch);

        // System.out.println(name.lastIndexOf("S" ,8));
        // System.out.println("My name is \"Varis\"");

        
    }
}