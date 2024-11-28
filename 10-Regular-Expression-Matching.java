class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] mat = new boolean[s.length() + 1][p.length() + 1];

        mat[0][0] = true;

        for (int i = 1; i < mat[0].length; i++) {
            if (p.charAt(i - 1) == '*') mat[0][i] = mat[0][i - 2];
        }

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    mat[i][j] = mat[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    mat[i][j] = mat[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        mat[i][j] = mat[i][j] | mat[i - 1][j];
                    }
                } else {
                    mat[i][j] = false;
                }
            }
        }

        return mat[s.length()][p.length()];
    }
}