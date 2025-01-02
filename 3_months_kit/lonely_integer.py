def lonelyinteger(a):
    seen_items = {}
    for element in a:
        if element not in seen_items:
            seen_items[element] = 1
        else:
            seen_items[element] += 1
    for item in seen_items:
        if seen_items[item] == 1:
            return item  
