function characterReplacement(s: string, k: number): number {
    // window invalid case
    // length -> max length, current length
    // k -> replacements
    // frequency -> maximum current window freqeuncy of a letter
    let left=0, right=0;
    // first char at gives character, charCodeAt gives Ascii value
    let a = "A".charCodeAt(0);
    let frequency: number[] = new Array(26).fill(0);
    let maxFrequency = 0;
    let maxLength=0;
    let currentWindowLength=0;
    for ( let right=0; right<s.length ; right++){
        frequency [ s.charAt(right).charCodeAt(0) - a]+=1; // increase frequency by 1
        maxFrequency = Math.max(frequency [ s.charAt(right).charCodeAt(0) - a],  maxFrequency )
        currentWindowLength = right - left + 1;
        if ( currentWindowLength - maxFrequency > k ){
            frequency [ s.charAt(left).charCodeAt(0) - a]-=1; // decrease frequency by 1
            left+=1;
        }
        maxLength= Math.max( right - left + 1,  maxLength );

    }
    return maxLength;
};