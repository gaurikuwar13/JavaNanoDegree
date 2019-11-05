public void test(){
        vowelOnly("This is a mess");
    }
    public static void vowelOnly(String text)  {
       int count = 0;
       StringBuilder stringBuilder = new StringBuilder();
       Pattern pattern = Pattern.compile("[aeiou]");
       Matcher matcher = pattern.matcher(text);
       while(matcher.find()){
           System.out.println("The vowel is :"+ matcher.group());
           count++;
           stringBuilder.append(matcher.group());
       }
       System.out.println("The vowels in the string are :" + stringBuilder);
       System.out.println("The count of the vowel is :" + count);
    }