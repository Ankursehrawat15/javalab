/implicit type casting - automatic conversion
char ch = 'A'; // 2 bytes
int num = ch; // 2 bytes to 4 bytes

/* explicit type casting - no automatic conversion
 * because converting higher data type to lower data type
 */
int num = 100; //4 bytes
char ch = (char)num; //4 bytes to 2 bytes
