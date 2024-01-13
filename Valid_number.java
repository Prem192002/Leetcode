class Valid_number{
    public boolean isNumber(String s) {
        String pattern = "^[+-]?(\\d+\\.\\d*|\\.\\d+|\\d+)([eE][+-]?\\d+)?$";
        return s.matches(pattern);
    }

    public static void main(String[] args) {
        Valid_number solution = new Valid_number();
        System.out.println(solution.isNumber("0"));      // Output: true
        System.out.println(solution.isNumber("e"));      // Output: false
        System.out.println(solution.isNumber("."));      // Output: false
        System.out.println(solution.isNumber("2e10"));    // Output: true
        System.out.println(solution.isNumber("95a54e53"));// Output: false
    }
}