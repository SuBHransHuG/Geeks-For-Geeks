class Solution {
    
    static boolean isVowel(char x) 
{ 
    return (x == 'a' || x == 'e' || x == 'i' || 
            x == 'o' || x == 'u'); 
}
    
    public Node arrangeCV(Node head){
        
        Node newHead = head; 
 
    // for keep track of vowel 
    Node latestVowel; 
 
    Node curr = head; 
 
    // list is empty 
    if (head == null) 
        return null; 
 
    // We need to discover the first vowel 
    // in the list. It is going to be the 
    // returned head, and also the initial 
    // latestVowel. 
    if (isVowel(head.data) == true) 
 
        // first element is a vowel. It will 
        // also be the new head and the initial 
        // latestVowel; 
        latestVowel = head; 
 
    else
    { 
 
        // First element is not a vowel. Iterate 
        // through the list until we find a vowel. 
        // Note that curr points to the element 
        // *before* the element with the vowel. 
        while (curr.next != null && 
            !isVowel(curr.next.data)) 
            curr = curr.next; 
 
 
        // This is an edge case where there are 
        // only consonants in the list. 
        if (curr.next == null) 
            return head; 
 
        // Set the initial latestVowel and the 
        // new head to the vowel item that we found. 
        // Relink the chain of consonants after 
        // that vowel item: 
        // old_head_consonant->consonant1->consonant2-> 
        // vowel->rest_of_list becomes 
        // vowel->old_head_consonant->consonant1-> 
        // consonant2->rest_of_list 
        latestVowel = newHead = curr.next; 
        curr.next = curr.next.next; 
        latestVowel.next = head; 
    } 
 
    // Now traverse the list. Curr is always the item 
    // *before* the one we are checking, so that we 
    // can use it to re-link. 
    while (curr != null && curr.next != null) 
    { 
        if (isVowel(curr.next.data) == true) 
        { 
            // The next discovered item is a vowel 
            if (curr == latestVowel) 
            { 
                // If it comes directly after the 
                // previous vowel, we don't need to 
                // move items around, just mark the 
                // new latestVowel and advance curr. 
                latestVowel = curr = curr.next; 
            } 
            else
            { 
 
                // But if it comes after an intervening 
                // chain of consonants, we need to chain 
                // the newly discovered vowel right after 
                // the old vowel. Curr is not changed as 
                // after the re-linking it will have a 
                // new next, that has not been checked yet, 
                // and we always keep curr at one before 
                // the next to check. 
                Node temp = latestVowel.next; 
 
                // Chain in new vowel 
                latestVowel.next = curr.next; 
 
                // Advance latestVowel 
                latestVowel = latestVowel.next; 
 
                // Remove found vowel from previous place 
                curr.next = curr.next.next; 
 
                // Re-link chain of consonants after latestVowel 
                latestVowel.next = temp; 
            } 
        } 
        else
        { 
 
            // No vowel in the next element, advance curr. 
            curr = curr.next; 
        } 
    } 
    return newHead; 
        //write code here and return the head of changed linked list
    }
}
