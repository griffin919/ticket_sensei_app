<template>
    <div class="fixed inset-0 flex items-center justify-center z-50 " id="modal-root">
    <div class="modal">
      <div class="p-4 bg-white shadow-lg rounded">
        <!-- Your modal content goes here -->
        <slot></slot>
        <button @click="closeModal" class="mt-4 text-blue-500">Close</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    closeModal() {
      this.$emit('close');
    },
  },
};
</script>

<style>
#modal-root {
  background-color: rgba(0, 0, 0, 0.9);
}

.modal {
  background-color: rgba(0, 0, 0, 0.5);
}

.modal-content {
  width: 400px;
  background-color: white;
}
</style>