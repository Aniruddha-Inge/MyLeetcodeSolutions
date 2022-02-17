class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int[] ransomNoteLetters = new int[26];
    int[] magazineLetters = new int[26];
    Arrays.fill(ransomNoteLetters, 0);
    Arrays.fill(magazineLetters, 0);

    for (char ch : ransomNote.toCharArray()) {
        ransomNoteLetters[ch - 'a'] += 1;
    }

    for (char ch : magazine.toCharArray()) {
        magazineLetters[ch - 'a'] += 1;
    }

    for (int i = 0; i < 26; i++) {
        if (magazineLetters[i] < ransomNoteLetters[i]) {
            return false;
        }
    }

    return true;
}
}