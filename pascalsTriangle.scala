def pascal(c: Int, r: Int): Int = {
	if (r < 0 || c < 0){
		0
	}else if (r == 0 || c == 0 || r == c){
		1
	}else {
		pascal(c, r-1) + pascal(c-1, r-1)
	}
}