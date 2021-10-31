# Count Vowels in a String
def count_vowels(string):
    vowels = ['a', 'e', 'i', 'o', 'u']
    vowel_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
    return vowel_count 