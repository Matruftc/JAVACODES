class Stringmethodsex{
    public static void main(String[] args) {
        String prefix="heyyyy";
        String example="hello dears give me the feedback of my code...";
        System.out.println("lowercase: "+ example.toLowerCase());
        System.out.println("length: "+ example.length());
        System.out.println("Uppercase: "+ example.toUpperCase());
        System.out.println("Substring with startindex and end index: "+ example.substring(3,18));
        System.out.println("substring: "+ example.substring(24));
        System.out.println("Startswith: "+ example.startsWith(prefix));
        System.out.println("Endswith: "+ example.endsWith(prefix));
        System.out.println("indexof: "+ example.indexOf(example));
        System.out.println("COncat: "+ example.concat(prefix));

    }
}