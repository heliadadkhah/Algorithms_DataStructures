# def generate_random_data(num_pairs):
#     return [(random.random(), f"Value {i}") for i in range(num_pairs)]

# def test_skiplist(skiplist, insert_data, search_data, p):
#     start_time = time.time()
#     comparisons = 0

#     # Einfügen
#     for key, value in insert_data:
#         skiplist.insert(key, value)
    
#     # Suchen und Löschen
#     for i, key in enumerate(search_data):
#         if i % 1000 == 0:  # Nach je 1000 Einfügeoperationen
#             for search_key in search_data[:2000]:
#                 skiplist.search(search_key)
#             for del_key in search_data[:500]:  # Löschen von 500 Schlüsseln
#                 skiplist.delete(del_key)

#     end_time = time.time()
#     print(f"Test completed with p={p}. Time taken: {end_time - start_time} seconds.")
#     # Hier können Sie auch die Anzahl der Vergleiche ausgeben

# # Test durchführen
# max_height = 10
# num_pairs = 2000000
# insert_data = generate_random_data(num_pairs)
# search_data = generate_random_data(2000)

# for p in [0.25, 0.5, 0.75]:  # Experimentieren mit verschiedenen p-Werten
#     skiplist = SkipList(max_height, p)
#     test_skiplist(skiplist, insert_data, search_data, p)

