#include <list>
#include <map>

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