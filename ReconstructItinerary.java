class Solution {
    HashMap<String, PriorityQueue<String>> map = new HashMap<>();
	List<String> res = new LinkedList<>();

	public List<String> findItinerary(List<List<String>> tickets) {
		for (List<String> ticket : tickets) {
			map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
			map.get(ticket.get(0)).offer(ticket.get(1));
		}
		helper("JFK");
		return res;
	}

	public void helper(String departure) {
		while (map.containsKey(departure) && !map.get(departure).isEmpty()) {
			helper(map.get(departure).poll());
		}
		res.add(0, departure);
	}
}
