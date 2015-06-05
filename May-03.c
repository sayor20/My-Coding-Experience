
Node checknode(Node root, int value){
	if(root!=null){
			currval=root.getvalue();
			if(currval>value)
					return checknode(root.getleft(),value)
			else if(currval<value)
					return checknode(root.getRight(),value)
			}	
	return root;
	}