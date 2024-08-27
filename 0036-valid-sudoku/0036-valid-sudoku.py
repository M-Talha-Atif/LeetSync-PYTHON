class Solution:
 def isValidSudoku(self, board: List[List[str]]) -> bool:
   
     # Initialize an empty dictionary to store the mapping
    mapping = {}

# Fill the dictionary for box1 as an example
    for i in range(0, 3):
       for j in range(0, 3):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(0, 3):
       for j in range(3,6):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(0, 3):
       for j in range(6,9):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(3, 6):
       for j in range(0,3):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(3, 6):
       for j in range(3,6):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(3, 6):
       for j in range(6,9):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(6, 9):
       for j in range(0,3):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(6, 9):
       for j in range(3,6):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
           mapping[key] = value  # Otherwise, store the tuple (i, j) as the value
    mapping = {}
    for i in range(6, 9):
       for j in range(6,9):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        
        if key in mapping:
            return False
        else:
            mapping[key] = value  # Otherwise, store the tuple (i, j) as the value

    mapping = {} # rows
    for i in range(0, 9):
       mapping = {}
       for j in range(0,9):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        if key in mapping:
            return False
        else:
            mapping[key] = value  
            
    mapping = {} # columns
    for j in range(0, 9):
       mapping = {}
       for i in range(0,9):
        key = board[i][j]
        if key == ".":
            continue
        value = (i, j)
        if key in mapping:
            return False
        else:
            mapping[key] = value 
    return True

   