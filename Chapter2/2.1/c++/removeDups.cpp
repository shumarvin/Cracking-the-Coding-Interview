#include <list>
#include <map>

/*
Removes all duplicates in list
Algorithm:
1. Create empty hashtable to keep track of dups
2. Go through linked list. If the current Node is
in the hashtable, delete it. If not, then add
it to the hashtable.
*/
template <typename T>
void removeDups(typename std::list<T> &lst)
{
	typename std::map<T, bool> elements;
	typename std::list<T>::iterator iterator = lst.begin();
	while(iterator != lst.end())
	{
		if (elements.find(*iterator) != elements.end())
			iterator = lst.erase(iterator);
			
		else
		{
			elements.insert(typename std::pair<T,bool>(*iterator, true));
			iterator++;
		}
	}	
	return;
}

/*
Same function as above, except it doesn't use any temporary
buffers. Instead, for each element, it traverses the rest
of the linked list to remove any duplicates.
*/
template <typename T>
void removeDups2(typename std::list<T> &lst)
{
	return;
}